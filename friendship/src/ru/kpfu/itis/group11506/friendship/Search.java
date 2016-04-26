package ru.kpfu.itis.group11506.friendship;

//import java.util.ArrayList;
import java.util.Stack;

public class Search {

	private boolean[] color;
	private Stack[] v;

	public Search(Stack[] graph) {
		color = new boolean[graph.length];
		this.v = graph;
	}

	public void find(int in) {
		System.out.println(in);
	}

	public void dfs(int x) {
		color[x] = true;
		find(x);
		while (!v[x].isEmpty()) {
			int u = (int) v[x].pop();
			if (u < color.length) {
				if (!color[u])
					dfs(u);
			} else {
				break;
			}

		}
	}
}