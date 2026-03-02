package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        @Pattern(regexp = "\\d{11}")
        String telefone,
        @NotBlank
        @Pattern(regexp = "\\d{4,6}") //DETERMINA UM MODELO QUE ACEITA NO DE 4 À 6 DIGITOS / EXPRESSÃO REGULAR
        String crm,
        @NotNull // NÃO É NOT BLACK PQ NÃO É STRING
        Especialidade especialidade,
        @NotNull
        @Valid // VALIDA TAMBÉM O OUTRO OBJETO QUE ESTA COMO ATRIBUTO
        DadosEndereco endereco
) {
}
