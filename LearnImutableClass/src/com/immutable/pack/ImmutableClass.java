package com.immutable.pack;

import java.util.Map;

 final class ImmutableClass {

	 	private final String name;
	    private final int regNo;
	    private final Map<String, String> metadata;
	    
		public ImmutableClass(String name, int regNo, Map<String, String> metadata) {
			super();
			this.name = name;
			this.regNo = regNo;
			this.metadata = metadata;
		}
	    
	    
	    
}
