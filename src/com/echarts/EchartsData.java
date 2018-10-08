package com.echarts;

import java.util.ArrayList;
import java.util.List;


public class EchartsData {
	private List<Nodes> nodes = new ArrayList<Nodes>();
    private List<Links> links = new ArrayList<Links>();

    public List<Nodes> getNodes() {
        return nodes;
    }

    public void setNodes(List<Nodes> nodes) {
        this.nodes = nodes;
    }

    public List<Links> getLinks() {
        return links;
    }

    public void setLinks(List<Links> links) {
        this.links = links;
    }
}

