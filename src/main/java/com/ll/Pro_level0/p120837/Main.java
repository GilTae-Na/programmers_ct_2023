package com.ll.Pro_level0.p120837;

public class Main {
    public static void main(String[] args) {

    }
}

class Polynomial {
    private String input;

    Polynomial(String in) {
        this.input = in;
    }

    public int calc() {
        String[] temp = input.split(" \\+ ");
        return Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]);
    }
}

//public static int calc2() {
//        List<String> list = new ArrayList<>();
//        Stack<String> stack = new Stack<>();
//
//        String strNum = my_string.replaceAll(" ", "");
//        char[] chars = strNum.toCharArray();
//
//        for (int i = 0; i < chars.length; i++) {
//            if (Character.isDigit(chars[i])) {
//                list.add(String.valueOf(chars[i])); // 숫자라면 출력(리스트에 저장)
//            } else {
//                // 연산자면 stack에 푸시
//                String s = String.valueOf(chars[i]);
////                String s = Character.toString(chars[i]);
//                if (s.equals("+") || s.equals("-")) { // + - 를 만나면 모두 꺼내기
//                    while (!stack.isEmpty()) {
//                        if (stack.peek().equals("(")) {
//                            break;
//                        }
//                        list.add(stack.pop());
//                    }
//                    stack.push(s);
//                } else if (s.equals("*") || s.equals("/")) { // * / 는 모두 푸시
//                    stack.push(s);
//                } else if (s.equals("(")) {
//                    stack.push(s);
//                } else if (s.equals(")")) { // ) 닫는 괄호를 만나면
//                    while (!stack.isEmpty()) { // ( 여는 괄호 만날 때까지 pop하기
//                        if (stack.peek().equals("(")) {
//                            stack.pop();
//                            break;
//                        }
//                        list.add(stack.pop());
//                    }
//                }
//            }
//        }
//        while (!stack.isEmpty()) {
//            list.add(stack.pop());
//        }
//
//        // 계산
//        Stack<Integer> stack2 = new Stack<>();
//
//        for (String s : list) { // 후위 표기법 대로 들어간 리스트를 하나씩 빼면서
//            if (s.matches("[0-9]")) { // 숫자는 스택에 넣어줌
//                // 숫자면 변환
//                stack2.push(Integer.valueOf(s));
//            } else { // 연산자를 만나면
//                int n1 = stack2.pop(); // 두 개씩 빼서 연산
//                int n2 = stack2.pop();
//                switch (s) {
//                    case "+":
//                        stack2.push(n2 + n1); // 연산한 값 다시 스택에 넣어주기
//                        break;
//                    case "-":
//                        stack2.push(n2 - n1);
//                        break;
//                    case "*":
//                        stack2.push(n2 * n1);
//                        break;
//                    case "/":
//                        stack2.push(n2 / n1);
//                        break;
//                }
//            }
//        }
//
//        Integer answer = stack2.pop(); // 스택에 남은 마지막 값이 최종 연산결과
//
//        stack.clear();
//        stack2.clear();
//        return answer;
//    }
//}