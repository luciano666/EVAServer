alerta.
indisponibilidade.
indisponivel.
sistema_indisponivel.
sistema_fora.

sistema(cnis).
sistema(funpresp).

alerta(X,Y) :- sistema(X),(Y==alerta;Y==indisponibilidade;Y==indisponivel;Y==sistema_indisponivel;Y==sistema_fora).
consulta(X,Y) :- sistema(X),(Y\==alerta,Y\==indisponibilidade,Y\==indisponivel,Y\==sistema_indisponivel,Y\==sistema_fora).
