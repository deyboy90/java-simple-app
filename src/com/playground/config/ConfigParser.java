package com.playground.config;

import java.util.List;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.internal.Lists;

public class ConfigParser {

	@Parameter(names = "--participatingNodes", description = "Nodes participating in the work")
    public List<String> participatingNodes = Lists.newArrayList();
 
    @Parameter(names = "--currentNode", description = "Current node")
    public String currentNode;
    
    @Parameter(names = "--timer", description = "Delay timer")
    public Long timer;
 
    @Parameter(names = "--debug", description = "Debug mode")
    public boolean debug = false;

//    @DynamicParameter(names = "-D", description = "Dynamic parameters go here")
//    public Map<String, String> dynamicParams = new HashMap<String, String>();

}
