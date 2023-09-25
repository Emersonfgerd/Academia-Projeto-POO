import java.text.Normalizer;
import java.util.HashMap;
import java.util.Map;

public class Treino {
    private Map<String, String> treinos;

    public Treino(){
        treinos = new HashMap<>();

        treinos.put("SEGUNDA", "Peito, Ombro, Tríceps \n Peito:\n Supino Reto - 3x10\n Supino Inclinado - 3x10\n Ombro:\n Desenvolvimento - 3x10\n Elevação Lateral - 3x10\n Tríceps:\n Triceps Barra - 3x10\n Tríceps Corda - 3x10\n");
                // Terça sem ç
        treinos.put("TERCA", "Costas, Bíceps \n Costas:\n Puxador Frontal - 3x10\n Remada Curvada - 3x10\n Bíceps: \n Rosca Direta - 3x10\n Rosca Alternada - 3x10\n"); 
        treinos.put("QUARTA", "Pernas \n Agachamento Livre - 3x10\n Leg Press - 3x10\n Extensora - 3x10\n");
        treinos.put("QUINTA", "Peito, Ombro, Tríceps \n Peito:\n Peck Deck - 3x10\n Crucifixo - 3x10\n Ombro:\n Elevação Frontal - 3x10\n Lateral Curvado - 3x10\n Tríceps:\n Tríceps Françes - 3x10\n Tríceps Testa - 3x10\n");
        treinos.put("SEXTA", "Costas, Bíceps\n Costas:\n Remada Unilateral - 3x10\n Pull Down - 3x10\n Bíceps:\n Rosca Scott - 3x10\n Rosca Martelo - 3x10\n");
        treinos.put("SABADO", "Cardio\n Esteira:\n 20 - 60 minutos.\n"); // Sábado sem acento
        treinos.put("DOMINGO", "Descanso");
    }

    public String getTreino(String diaSemana){
        String diaSemanaNormalizado = normalizarTexto(diaSemana);
        return treinos.getOrDefault(diaSemanaNormalizado, "Treino não especificado para esse dia.");
    }
    
    private String normalizarTexto(String texto){
        if (texto == null){
            return "";
        }
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
        texto = texto.replaceAll("[^\\p{ASCII}]", "");
        return texto.toUpperCase();
    }
}
