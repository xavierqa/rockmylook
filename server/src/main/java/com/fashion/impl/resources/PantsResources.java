package com.fashion.impl.pants;

import org.apache.log4j.Logger;

import com.fashion.formats.pants.Pant;
import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.resources.CollectionResourceTemplate;

@RestLiCollection(name = "pant", namespace = "com.fashion.formats.pants")
public class PantsResources extends CollectionResourceTemplate<String, Pant>{

	
	private static Logger LOG = Logger.getLogger(PantsResources.class);
}
