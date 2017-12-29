package com.boot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.boot.model.Blogpost;

public class BlogpostStub {
	private static Map<Long, Blogpost> sinfo = new HashMap<Long, Blogpost>();
	private static Long idIndex = 3L;

	//populate initial sinfo
	static {
		Blogpost a = new Blogpost(1L, "blog 1", "d1 devops",	"A SERVER", "", 1994);
		sinfo.put(1L, a);
		Blogpost b = new Blogpost(2L, "blog 2", "d1 devops",	"B SERVER", "", 1994);
		sinfo.put(2L, b);
		Blogpost c = new Blogpost(3L, "blog 3", "d1 devops",	"C SERVER", "", 1994);
		sinfo.put(3L, c);
	}

	public static List<Blogpost> list() {
		return new ArrayList<Blogpost>(sinfo.values());
	}

	public static Blogpost create(Blogpost wreck) {
		idIndex += idIndex;
		wreck.setId(idIndex);
		sinfo.put(idIndex, wreck);
		return wreck;
	}

	public static Blogpost get(Long id) {
		return sinfo.get(id);
	}

	public static Blogpost update(Long id, Blogpost wreck) {
		sinfo.put(id, wreck);
		return wreck;
	}

	public static Blogpost delete(Long id) {
		return sinfo.remove(id);
	}
}
