const React = require('react');
const ReactDOM = require('react-dom');
import { Formik, Form, Field, ErrorMessage } from 'formik';
import BlogPostsService from '../service/BlogPostsApiService.jsx'
const LISTPAGE = 'listpage';

class BlogPostComponent extends React.Component {

	constructor(props) {
		super(props);
		        this.state = {
                    id: this.props.match.params.id,
                    description: ''
                }

this.onSubmit = this.onSubmit.bind(this)
this.handleChange = this.handleChange.bind(this)
	}

    componentDidMount() {
        if(this.state)
        {
        console.log(this.state.id)

        // eslint-disable-next-line
        if (this.state.id == -1) {
            return
        }

        BlogPostsService.fetchBlogPostById(this.state.id)
            .then(response => this.setState(response))
            }
    }


render() {
    let { id, description } = this.state
    return (
        <div>
            <h3>Course</h3>
            <div className="container">
            <form onSubmit={this.onSubmit}>
                <fieldset className="form-group">
                    <label>Id</label>
                    <label className="form-control" type="text" name="id" value={this.state.id} disabled />
                </fieldset>
                <fieldset className="form-group">
                    <label>Description</label>
                    <input className="form-control" type="text" value={this.state.description} onChange={this.handleChange}  name="description" />
                </fieldset>
                <button className="btn btn-success" type="submit">Save</button>
            </form>
            </div>
        </div>
    )
}

onSubmit(values) {
            let course = {
                id: this.state.id,
                description: values.description
            }
            if (this.state.id === -1) {
                BlogPostsService.addBlogPost(course)
                    .then(() => this.props.history.push('/src/main/resources/static/blogposts'))
            } else {
                BlogPostsService.editBlogPost(this.state.id, course)
                    .then(() => this.props.history.push('/src/main/resources/static/blogposts'))
            }
            console.log(values);

}
  handleChange(event) {
    const target = event.target;
    const value = target.value;
    const name = target.name;

    this.setState({[name]:value});
  }

}

export default BlogPostComponent;