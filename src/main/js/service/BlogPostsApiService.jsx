import axios from 'axios';

const API_BASE_URL = '/blogposts';

class BlogPostsApiService {

    fetchBlogPosts() {
        return axios.get(API_BASE_URL);
    }

    fetchBlogPostById(BlogPostId) {
        return axios.get(API_BASE_URL + '/' + BlogPostId);
    }

    deleteBlogPost(BlogPostId) {
        return axios.delete(API_BASE_URL + '/' + BlogPostId);
    }

    addBlogPost(BlogPost) {
        return axios.post(""+API_BASE_URL, BlogPost);
    }

    editBlogPost(BlogPost) {
        return axios.put(API_BASE_URL + '/' + BlogPost.id, BlogPost);
    }

}

export default new BlogPostsApiService();
