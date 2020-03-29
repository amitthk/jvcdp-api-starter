'use strict';

const React = require('react');
const ReactDOM = require('react-dom');

import BlogPostListComponent from "../component/BlogPostListComponent.jsx"

class BlogPostApp extends React.Component {
                      render() {
                          return (<>
                                <h1>Blogpost Application</h1>
                                <BlogPostListComponent />
                              </>
                          )
                      }


//                   componentDidMount(){
//                   alert('inside componentDidMount')
//                   this.loadBlogPostList();
//                   }
//
//                       loadBlogPostList(){
//                       alert('loac')
//                               BlogPostsService.fetchBlogPosts()
//                                   .then((res) => {
//                                       this.setState({blogposts: res.text})
//                                   });}
}

export default BlogPostApp