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
                  }
export default BlogPostApp