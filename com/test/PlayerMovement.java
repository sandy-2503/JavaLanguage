package com.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PlayerMovement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players (N): ");
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        char[] moves = new char[N];
        System.out.println("Enter the moves for each player (e.g., < > ^ v): ");
        for (int i = 0; i < N; i++) {
            moves[i] = scanner.next().charAt(0);
        }

        // Initialize player positions
        Set<Integer> positions = new HashSet<>();
        for (int i = 0; i < N; i++) {
            positions.add(i);
        }

        // Process moves
        for (int i = 0; i < N; i++) {
            int currentPosition = i;
            char move = moves[i];
            int targetPosition = -1;

            switch (move) {
                case '<':
                    targetPosition = currentPosition - 1;
                    break;
                case '>':
                    targetPosition = currentPosition + 1;
                    break;
                case '^':
                    targetPosition = currentPosition - N; // Move up
                    break;
                case 'v':
                    targetPosition = currentPosition + N; // Move down
                    break;
                default:
                    System.out.println("Invalid move: " + move);
                    continue;
            }

            // Check if the target position is valid and empty
            if (targetPosition >= 0 && targetPosition < N && !positions.contains(targetPosition)) {
                positions.remove(currentPosition);
                positions.add(targetPosition);
                System.out.println("Player " + i + " moved to position " + targetPosition);
            } else {
                System.out.println("Player " + i + " could not move.");
            }
        }

        scanner.close();
    }
}

