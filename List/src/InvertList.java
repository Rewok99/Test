    public class InvertList {
        static Unit reverseList(Unit head) {
            Unit prev = null;
            Unit current = head;
            Unit next;

            while (current != null) {
                next = current.next;     // Сохраняем следующий элемент перед изменением указателей
                current.next = prev;     // Инвертируем указатель следующего элемента на предыдущий элемент
                prev = current;          // Сдвигаем указатель на текущий элемент
                current = next;          // Переходим к следующему элементу
            }

            return prev;                // Новый начальный элемент списка после инверсии
        }

        static void printList(Unit head) {
            Unit current = head;
            while (current != null) {
                System.out.print(current.data + " ");  // Выводим данные текущего элемента
                current = current.next;                // Переходим к следующему элементу
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Unit head = new Unit(1);
            head.next = new Unit(2);
            head.next.next = new Unit(3);
            head.next.next.next = new Unit(4);
            head.next.next.next.next = new Unit(5);

            System.out.println("Исходный список:");
            printList(head);

            Unit reversedHead = reverseList(head);  // Инвертируем список

            System.out.println("Reversed List:");
            printList(reversedHead);                // Выводим инвертированный список
        }
    }

