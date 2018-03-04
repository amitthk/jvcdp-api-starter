package com.jvcdp;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import com.jvcdp.controller.BlogpostController;
import com.jvcdp.model.Blogpost;
import com.jvcdp.repository.BlogpostRepository;

public class BlogpostControllerTest {
	@InjectMocks
	private BlogpostController sc;

	@Mock
	private BlogpostRepository blogpostRepository;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void testBlogpostGet() {
    	Blogpost sw = new Blogpost();
    	sw.setId(1l);
		when(blogpostRepository.findOne(1l)).thenReturn(sw);

		Blogpost wreck = sc.get(1L);

		verify(blogpostRepository).findOne(1l);		

//		assertEquals(1l, wreck.getId().longValue());	
		assertThat(wreck.getId(), is(1l));
	}

}
