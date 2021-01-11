package ru.karin.nc_hw2.horstmann.Interfaces;

public class IntSequence {

    public int next() {
        return 0;
    }

    public boolean hasNext() {
        return false;
    }

    public static IntSequence of(int... sequence) {
        return new IntSequence() {
            int[] seq = sequence;
            int iter = 0;

            @Override
            public int next() {
                return seq[iter++];
            }
            @Override
            public boolean hasNext() {
                return iter < seq.length;
            }
        };
    }

    public static IntSequence Constant(int i) {
        return new IntSequence() {
            @Override
            public int next() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        IntSequence intSeq = IntSequence.of(1, 2, 5, 8, 10);
        while(intSeq.hasNext()) {
            System.out.println(intSeq.next());
        }
        IntSequence constant = Constant(6);
        System.out.println(constant.next());
        System.out.println(constant.next());
        System.out.println(constant.next());
        System.out.println(constant.next());



    }

}
