public class Usuario {

    private Nodo head;
    private Nodo tail;

    public Usuario(){

    }

    public Nodo getHead() {
        return head;
    }

    public int darTurno(int numPersona, int aux){

        int [] numTurno = new int[numPersona];
        aux = numPersona;

        if(numPersona != aux){

            darTurno(numPersona++, aux);
        }
        return numPersona;
    }
    private void mostrarTurno(Nodo current){

        if(head == null){
            head = current.getNext();
            tail = current.getPrev();
        }else{
            tail.setNext(current);
            tail = current;
        }

        System.out.println(current.getId());
        print(current.getNext());
    }

    public void addLast(Nodo input) {

        if (head == null) {
            head = input;
            head.setNext(input);
            head.setPrev(input);
        } else {
            Nodo tail = head.getPrev();

            tail.setNext(input);
            input.setNext(head);

            head.setPrev(input);
            input.setPrev(tail);

        }
    }

    public void print(){

        print(head);
    }
    private void print(Nodo current){

        if(current == null){
            return;
        }

        System.out.println(current.getId());
        print(current.getNext());
    }

    public void deleteTurn() {

        deleteTurn();
    }

    public void deleteTurn(Nodo current, Nodo head) {
        if (current == head) {
            Nodo prev = current.getPrev();
            Nodo next = current.getNext();

                //ahora enlazarlos
            prev.setNext(next);
            next.setPrev(prev);
            head = next;


        }
    }

    public void mostrarTurno() {
    }

}
