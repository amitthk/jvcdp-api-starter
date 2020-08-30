import React from 'react';
//import './App.css';
import BlogPostApp from './component/BlogPostApp.jsx';
import { BrowserRouter } from 'react-router-dom';

class App extends React.Component {
  render() {
    return (
      <div className="container">
         <BrowserRouter basename="/src/main/resources/static" />
         <BlogPostApp />
      </div>
    );
  }
}

export default App;
