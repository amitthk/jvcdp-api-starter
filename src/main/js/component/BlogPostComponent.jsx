const React = require('react');
const ReactDOM = require('react-dom');
import BlogPostsService from '../service/BlogPostsApiService.jsx'
const LISTPAGE = 'listpage';

class BlogPostComponent extends React.Component {


	constructor(props) {
		super(props);
this.onSubmit = this.onSubmit.bind(this)
	}


render() {
    let { description, id } = this.state
    return (
        <div>
            <h3>Course</h3>
            <div className="container">
                <Formik
                    initialValues={{ id, description }}
                          onSubmit={this.onSubmit}
                >
                    {
                        (props) => (
                            <Form>
                                <fieldset className="form-group">
                                    <label>Id</label>
                                    <Field className="form-control" type="text" name="id" disabled />
                                </fieldset>
                                <fieldset className="form-group">
                                    <label>Description</label>
                                    <Field className="form-control" type="text" name="description" />
                                </fieldset>
                                <button className="btn btn-success" type="submit">Save</button>
                            </Form>
                        )
                    }
                </Formik>
            </div>
        </div>
    )
}

onSubmit(values) {
    console.log(values);
}

}
