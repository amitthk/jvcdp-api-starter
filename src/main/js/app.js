const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {blogposts: []};
	}

	componentDidMount() {
		client({method: 'GET', path: '/api/blogposts'}).done(response => {
			this.setState({blogposts: response.entity._embedded.blogposts});
		});
	}

	render() {
		return (
			<blogpostList blogposts={this.state.blogposts}/>
		)
	}
}