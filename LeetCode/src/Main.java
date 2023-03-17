

//Se definește o clasă numită "Main" care va conține metoda "addTwoNumbers"
//ce va efectua adunarea a două numere reprezentate ca liste înlănțuite.
public class Main extends ListNode{
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode(0); // creați un nod fictiv
            ListNode current = dummy; // setați nodul curent la nodul fictiv
            int carry = 0; // inițializați transportul cu 0

            while (l1 != null || l2 != null || carry != 0) { // parcurgeți listele până la sfârșit sau până când nu mai există transport
                int sum = carry; // adăugați transportul curent la suma
                if (l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }
                if (l2 != null) {
                    sum += l2.val;
                    l2 = l2.next;
                }
                carry = sum / 10; // actualizați transportul
                current.next = new ListNode(sum % 10); // adăugați nodul curent la lista de rezultate
                current = current.next; // avansați la următorul nod
            }

            return dummy.next; // returnați lista de rezultate (fără nodul fictiv)
        }
    }