package br.com.hivecloud.transportadora.model.enums;

import java.io.Serializable;

/**
 * Enum responsável pelas unidades federativas
 * @author bruno
 *
 */
public enum UnidadeFederativa implements Serializable{

	  AMAZONAS("Amazonas", "AM", "Manaus"), 
	  ALAGOAS("Alagoas", "AL", "Maceió"), 
	  ACRE("Acre", "AC", "Rio Branco"),
	  AMAPA("Amapá", "AP", "Macapá"), 
	  BAHIA("Bahia", "BA", "Salvador"), 
	  PARA("Pará", "PA", "Belém"),
	  MATO_GROSSO("Mato Grosso", "MT", "Cuiabá"), 
	  MINAS_GERAIS("Minas Gerais", "MG", "Belo Horizonte"),
	  MATO_GROSSO_DO_SUL("Mato Grosso do Sul", "MS", "Campo Grande"), 
	  GOIAS("Goiás", "GO", "Goiânia"),
	  MARANHAO("Maranhão", "MA", "São Luís"), 
	  RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS", "Porto Alegre"),
	  TOCANTINS("Tocantins", "TO", "Palmas"), 
	  PIAUI("Piauí", "PI", "Teresina"), 
	  SAO_PAULO("São Paulo", "SP", "São Paulo"),
	  RONDONIA("Rondônia", "RO", "Porto Velho"), 
	  RORAIMA("Roraima", "RR", "Boa Vista"),
	  PARANA("Paraná", "PR", "Curitiba"), 
	  CEARA("Ceará", "CE", "Fortaleza"), 
	  PERNAMBUCO("Pernambuco", "PE", "Recife"),
	  SANTA_CATARINA("Santa Catarina", "SC", "Florianópolis"), 
	  PARAIBA("Paraíba", "PB", "João Pessoa"),
	  RIO_GRANDE_DO_NORTE("Rio Grande do Norte", "RN", "Natal"), 
	  ESPIRITO_SANTO("Espírito Santo", "ES", "Vitória"),
	  RIO_DE_JANEIRO("Rio de Janeiro", "RJ", "Rio de Janeiro"),
	  SERGIPE("Sergipe", "SE", "Aracaju"),
	  DISTRITO_FEDERAL("Distrito Federal", "DF", "Brasília");
	  
	  private String nome;
	  private String sigla;
	  private String capital;

	  /**
	   * Construtor do enum
	   *
	   * @param nome nome da unidade da federação completo
	   * @param sigla sigla da unidade da federação
	   * @param capital nome da capital da unidade da federação
	   */
	  UnidadeFederativa(final String nome, final String sigla, final String capital) {
	    this.nome = nome;
	    this.sigla = sigla;
	    this.capital = capital;
	  }

	  /**
	   * Converter a partir do nome da Unidade da Federacao, para o respectivo enum.
	   * 
	   * @param nomeUf
	   * @return a Unidade da Federação
	   */
	  public static UnidadeFederativa fromUF(final String nomeUf) {
	    for (final UnidadeFederativa uf : UnidadeFederativa.values()) {
	      if (uf.nome.equalsIgnoreCase(nomeUf)) {
	        return uf;
	      }
	    }
		return null;
	  }

	  /**
	   * Converte a partir da Sigla do parâmetro, para o enum da Unidade da Federação.
	   * 
	   * @param sigla
	   * @return a Unidade da Federação
	   */
	  public static UnidadeFederativa fromSigla(final String sigla) {
	    for (final UnidadeFederativa uf : UnidadeFederativa.values()) {
	      if (uf.sigla.equalsIgnoreCase(sigla)) {
	        return uf;
	      }
	    }
	    return null;
	  }

	  /**
	   * Converte, a partir do nome da capital da UF, para o Enum.
	   * 
	   * @param capital
	   * @return a Unidade da Federacao com a capital passada no parâmetro
	   */
	  public static UnidadeFederativa fromCapital(final String capital) {
	    for (final UnidadeFederativa uf : UnidadeFederativa.values()) {
	      if (uf.capital.equalsIgnoreCase(capital)) {
	        return uf;
	      }
	    }
	    return null;
	  }

	  /**
	   * Obtém a sigla da UF
	   *
	   * @return a sigla da UF
	   */
	  public String sigla() {
	    return this.sigla;
	  }

	  /**
	   * Nome da UF
	   *
	   * @return nome completo da UF
	   */
	  public String nome() {
	    return this.nome;
	  }

	  /**
	   * Nome da capital da UF
	   *
	   * @return nome da capital da UF
	   */
	  public String capital() {
	    return this.capital;
	  }

	  @Override
	  public String toString() {
	    final StringBuilder sb = new StringBuilder("UnidadeFederativa{");
	    sb.append("nome='").append(nome).append('\'');
	    sb.append(", sigla='").append(sigla).append('\'');
	    sb.append(", capital='").append(capital).append('\'');
	    sb.append('}');
	    return sb.toString();
	  }
	}