// Meant to be main class which all inherit from
package me.replapiit.types;

import me.replapiit.utils.GraphQL;

import me.replapiit.utils.VarBuilder;
import me.replapiit.utils.QueryReader;


public class Cycles extends Type {
    public Cycles() throws Exception {
        super(QueryReader.read("cycles"), 0);
        // Is this good? I'm not sure what the ID thing is or how we will add more queries...
    }
}