package ru.kpfu.itis.group11506.friendship;

import java.util.Stack;

public class Main {
	public static void main(String[] args) {

		Stack[] graph = new Stack[3];
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new Stack();
		}

		graph[0].push(1);
		graph[0].push(2);
		graph[1].push(3);
		graph[2].push(2);

		Search search = new Search(graph);
		search.dfs(0);
	}
}
