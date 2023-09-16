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
                return RedirectToAction("Cadastrar");
            }

            return View();
        }
    }
}
