# language: es
# encoding: iso-8859-1
Característica: Busqueda de empleo
  Como desempleado
  deseo poder buscar empleo en la pagina de El empleo
  para poder ingresar a ver las ofertas disponibles

  Esquema del escenario: Busqueda exitosa
    Dado que estoy en la pagina de elempleo.com
    Cuando ingreso el filtro de <profesion> y <ciudad>
    Entonces puedo ingresar a ver las ofertas disponibles

    Ejemplos: 
      | profesion | ciudad |
      | Cont      | bog    |
