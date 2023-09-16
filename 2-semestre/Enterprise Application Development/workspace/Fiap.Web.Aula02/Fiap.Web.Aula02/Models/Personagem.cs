using System.ComponentModel.DataAnnotations;

namespace Fiap.Web.Aula02.Models
{
    public class Personagem
    {
        public int Id { get; set; }
        public string? Nome { get; set; }

        [Display(Name ="Nível de energia")]
        public int NivelEnergia { get; set; }
        public bool Capa { get; set; }

        [Display(Name = "Data de criação")]
        [DataType(DataType.Date)]
        public DateTime DataCriacao { get; set; }
    }
}
