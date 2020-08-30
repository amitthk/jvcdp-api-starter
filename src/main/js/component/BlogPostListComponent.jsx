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
                <h3>All Itms</h3>
                    {this.state.message && <div className="alert alert-success">{this.state.message}</div>}

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
                            <td><button className="btn btn-success" onClick={() => this.updateItmClicked(itm.id)}>Update</button></td>
                            <td><button className="btn btn-warning" onClick={() => this.deleteItmClicked({"id": itm.id})}>Delete</button></td>
                            </tr>)
                            }
                            <tr>
                             <td><button className="btn btn-success" onClick={() => this.addItmClicked()}>Add</button></td>
                            </tr>
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
                });
    }

    deleteItmClicked(id){
    console.log(id)
            BlogPostsService.deleteBlogPost(id)
            .then((res)=>{
                this.setState({message: `Deleted ${id}`});
            });
    }
    
    addItmClicked() {
            this.props.history.push(`/src/main/resources/static/edit-item/-1`)
        }
    
        updateItmClicked(id) {
            console.log('update ' + id)
            this.props.history.push(`/src/main/resources/static/edit-item/${id}`)
        }
    

}

export default BlogPostListComponent
