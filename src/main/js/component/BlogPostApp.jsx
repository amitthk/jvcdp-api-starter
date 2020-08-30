'use strict';

const React = require('react');
const ReactDOM = require('react-dom');
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import BlogPostComponent from "../component/BlogPostComponent.jsx";
import BlogPostListComponent from "../component/BlogPostListComponent.jsx";


class BlogPostApp extends React.Component {
                      render() {
                          return (
                          <Router>
                                  <h1>BlogPost Application</h1>
                                  <Switch>
                                      <Route path="/src/main/resources/static/" exact component={BlogPostListComponent} />
                                      <Route path="/src/main/resources/static/blogposts" exact component={BlogPostListComponent} />
                                      <Route path="/src/main/resources/static/edit-item/:id" component={BlogPostComponent} />
                                  </Switch>
                          </Router>
                          )
                      }
}

export default BlogPostApp