# Training

Query Score

### Arquitectura
![img.png](img/arq.png)

- service-score  (ltespinosa2020@gmail.com)
    - query db (posgrest)
    - db table score
        + id
        + score
    - capacidad de busqueda de varios score al mismo tiempo

- service-statistic (maide8901@gmail.com)
    - save information
    - save db (posgrest)
- 
- service-query (castellanoivian@gmail.com)
    - exponer los endpoint de colsulta de score
    - el cliente consulta id_cliente
    - orquestador logica
