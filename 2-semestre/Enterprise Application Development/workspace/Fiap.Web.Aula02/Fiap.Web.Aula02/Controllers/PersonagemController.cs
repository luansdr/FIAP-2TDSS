using Fiap.Web.Aula02.Models;
using Microsoft.AspNetCore.Mvc;

namespace Fiap.Web.Aula02.Controllers
{
    public class PersonagemController : Controller
    {
        private static List<Personagem> _lista = new List<Personagem>();



        [HttpGet]
        public IActionResult Index()
        {

            return View(_lista);
        }


        [HttpPost]
        public IActionResult Excluir(int id)
        {
            // Encontre o personagem com o ID especificado na lista
            var personagemParaExcluir = _lista.FirstOrDefault(p => p.Id == id);

            if (personagemParaExcluir != null)
            {
                // Remova o personagem da lista
                _lista.Remove(personagemParaExcluir);
            }

            // Redirecione de volta para a página Index
            return RedirectToAction("Index");
        }

        [HttpPost]
        public IActionResult Atualizar(int id, [FromBody] Personagem dadosAtualizados)
        {
            var personagemParaAtualizar = _lista.FirstOrDefault(p => p.Id == id);

            if (personagemParaAtualizar != null)
            {
                personagemParaAtualizar.Nome = dadosAtualizados.Nome;
                personagemParaAtualizar.NivelEnergia = dadosAtualizados.NivelEnergia;
                personagemParaAtualizar.Capa = dadosAtualizados.Capa;

                return RedirectToAction("Index");
            }

            return NotFound();
        }


        [HttpGet]
        public IActionResult Cadastrar()
        {
            ViewBag.personagens = _lista;
            return View();
        }

        [HttpPost]
        public IActionResult Cadastrar(Personagem personagem)
        {
            if (ModelState.IsValid)
            {
                personagem.Id = _lista.Count + 1;
                _lista.Add(personagem);

                ModelState.Clear();
                ViewBag.personagens = _lista;
                return RedirectToAction("");
            }

            return View();
        }
    }
}
