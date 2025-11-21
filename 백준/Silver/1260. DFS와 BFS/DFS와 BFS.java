import java.util.*;
import java.io.*;


public class Main{

    static boolean []visited;
    static boolean []visited2;
    static List<Integer> [] graph;
    static int N, M ,V;
    static Queue<Integer> que;
    static StringBuilder sb;
    static StringBuilder sb2;

    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N+1];

        for(int i =1; i <= N; i++){
            graph[i] = new ArrayList<>();
        }

        for(int j =0; j< M; j++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

            graph[a].add(b);
            graph[b].add(a);

        }
        visited = new boolean[N + 1];
        visited2 = new boolean[N + 1];

        // 정점 정렬 (작은 번호부터 방문하기 위해)
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        sb = new StringBuilder();
        sb2 = new StringBuilder();

        dfs(V);
        bfs(V);

        System.out.println(sb.toString());
        System.out.println(sb2.toString());


    }
    static void dfs(int node){
        visited[node] = true;
        sb.append(node).append(" ");

        for (int next : graph[node]){
            if(!visited[next]){
                dfs(next);
            }

        }

    }
    static void bfs(int node) {
        visited2[node] = true;
        que = new LinkedList<>();
        que.add(node);


        while (!que.isEmpty()) {
            int cnt = que.poll();
            sb2.append(cnt).append(" ");

            for (int next : graph[cnt]) {
                if (!visited2[next]) {
                    visited2[next] = true;
                    que.add(next);
                }

            }

        }


    }
}