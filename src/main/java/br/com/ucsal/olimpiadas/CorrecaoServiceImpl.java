public class CorrecaoServiceImpl implements CorrecaoService {

    @Override
    public double corrigir(Tentativa tentativa) {
        double nota = 0;

        for (Resposta r : tentativa.getRespostas()) {
            if (r.estaCorreta()) {
                nota++;
            }
        }

        return nota;
    }
}