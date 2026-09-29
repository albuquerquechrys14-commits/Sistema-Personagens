void main() {
    Personagem p1 = new Personagem("Emma", 3, 50);
    Mago mago = new Mago("Peter", 5, 80, 100);
    Guerreiro guerreiro = new Guerreiro("Bruce", 7, 95, 90);

    Personagem invalido = new Personagem("Qin", -5, 150);

    IO.println("=== -------- PERSONAGENS ------- ===");
    IO.println(p1);
    IO.println(mago);
    IO.println(guerreiro);
    IO.println(invalido);

    IO.println("\n=== ------- ATAQUES -------- ===");
    p1.atacar();
    mago.atacar();
    guerreiro.atacar();
}