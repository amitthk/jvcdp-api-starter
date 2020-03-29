const React = require('react');
const ReactDOM = require('react-dom');
import BlogPostsService from '../service/BlogPostsApiService.jsx'
class BlogPostListComponent extends React.Component {
	constructor(props) {
		super(props);
		this.state = {blogposts: []};
		this.state.blogposts.push({'id': '0', 'description': 'dummy'})
	}

    render() {
        return (
            <div className="container">
                <h3>All Courses</h3>
                <div className="container">
                    <table className="table">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Description</th>
                            </tr>
                        </thead>
                        <tbody>
                        {
                            this.state.blogposts.map(
                        itm =>
                                    <tr key={itm.id}>
                                    <td>{itm.id}</td>
                                        <td>{itm.description}</td>
                            </tr>)
                            }
                        </tbody>
                    </table>
                </div>
            </div>
        )
    }

    componentDidMount(){
    this.loadBlogPostList()
    }

    loadBlogPostList(){
            BlogPostsService.fetchBlogPosts()
                .then((res) => {
                    this.setState({blogposts: res.data})
                });}
}

export default BlogPostListComponent
