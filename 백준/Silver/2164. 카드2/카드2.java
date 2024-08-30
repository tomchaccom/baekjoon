import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int test = t.nextInt();

        int front = 0, rear = 0;
        int cque[] = new int[test * 2];

        // 1부터 test까지의 카드 삽입
        for (int i = 1; i <= test; i++) {
            cque[rear++] = i;
        }

        // 카드가 하나 남을 때까지 반복
        while (front + 1 != rear) {
            front++; // 제일 위의 카드를 버림
            cque[rear++] = cque[front++]; // 그 다음 카드를 아래로 옮김
        }

        // 마지막 카드 출력
        System.out.println(cque[front]);

        t.close();
    }
}
