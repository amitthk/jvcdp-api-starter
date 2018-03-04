package com.jvcdp.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jvcdp.model.Blogpost;
import com.jvcdp.repository.BlogpostRepository;

@RestController
@RequestMapping("blogposts")
public class BlogpostController {
	
	@Autowired
	private BlogpostRepository blogpostRepository;

	@GetMapping(value = "")
	public List<Blogpost> list() {
		return blogpostRepository.findAll();
	}

	@GetMapping(value = "/category/{category}")
	public List<Blogpost> blogpostsByCategory(@PathVariable String category) {
		return blogpostRepository.getBlogpostsByCategory(category);
	}

	@PostMapping(value = "")
	public Blogpost create(@RequestBody Blogpost blogpost) {
		return blogpostRepository.saveAndFlush(blogpost);
	}

	@GetMapping(value = "/{id}")
	public Blogpost get(@PathVariable Long id) {
		return blogpostRepository.findOne(id);
	}

	@PutMapping(value = "/{id}")
	public Blogpost update(@PathVariable Long id, @RequestBody Blogpost blogpost) {
		Blogpost existingBlogpost = blogpostRepository.findOne(id);
		BeanUtils.copyProperties(blogpost, existingBlogpost);
		return blogpostRepository.saveAndFlush(existingBlogpost);
	}

	@DeleteMapping(value = "/{id}")
	public Blogpost delete(@PathVariable Long id) {
		Blogpost existingBlogpost = blogpostRepository.findOne(id);
		blogpostRepository.delete(existingBlogpost);
		return existingBlogpost;
	}
	
}
