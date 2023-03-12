public class CustomStringArrayList {


        private int size;            // numărul de elemente din listă
        private int capacity;        // capacitatea curentă a listei
        private String[] elements;   // vectorul care reține elementele

        public CustomStringArrayList() {
            capacity = 10;           // capacitatea inițială
            size = 0;                // lista este inițial vidă
            elements = new String[capacity];   // alocare memorie
        }

        public void add(String element) {
            if (size == capacity) {  // dacă lista este plină, crește capacitatea
                grow();
            }
            elements[size] = element;  // adaugă noul element la sfârșitul listei
            size++;                   // crește numărul de elemente din listă
        }

        private void grow() {         // crește capacitatea listei
            capacity *= 1.5;          // noua capacitate va fi 1.5 ori mai mare decât cea curentă
            String[] newElements = new String[capacity];  // alocare memorie pentru noul vector
            System.arraycopy(elements, 0, newElements, 0, elements.length);  // copierea elementelor din vectorul
            // vechi în cel nou
            elements = newElements;   // vectorul vechi este înlocuit cu cel nou, cu capacitatea mărită
        }
    }


