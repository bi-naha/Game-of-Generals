package model.pieces;

public enum PieceType {
    K, G, S, B, L, P,
    k, g, s, b, l, p;

    public static boolean contains(String type) {

        for (PieceType c : PieceType.values()) {
            if (c.name().equals(type)) {
                return true;
            }
        }

        return false;
    }
}

