# upperBank

## Uma api para sistema bancário simples


- >Conta
    - [Cadastrar](#cadastrar-uma-conta)
    - Apagar
    - Listar todas
    - Buscar por {ID}
    - Buscar por {agencia} e {conta}
    - Atualizar por {ID}
    - Atualizar por {agencia} e {conta}
- >Login
    - Cadastrar
    - Apagar por {usuario}
    - Atualizar por {usuario}
    - Listar todos
- >Investimento
    - Cadastrar
    - Apagar todos
    - Apagar por {id}
    - Atualizar por {id}
    - Buscar todos
    - Buscar por {id}
- >Extrato
    - Cadastrar
    - Buscar tudo por {agencia} e {conta}
    - Apagar por {id}
    - Apagar tudo
    - Atualizar por {id}
- >Transferencia
    - Cadastrar
    - Buscar todas por {agencia} e {conta}
    - Atualizar por {id}
    - Apagar todas
    - Apagar por {agencia} e {conta}


<br><br><br>

<h1>Swagger upperbank</h1>

<details open>
<summary>Conta</summary>

<br>


<details open>
<summary> <b style="color:green">POST</b> /upperbank/api/conta</summary>

<br/>

# Cadastrar uma conta

<br/>

### Requisição:


```json
{
    
    "nome": "Luan Reis",
    "agencia": 0001,
    "conta": 00001,
}
```

<br/>

### Responses:
`status code: 200`

#### Tipo do body: <b>Application/json</b>
```json
{
    "id": 1,
    "nome": "Luan Reis",
    "agencia": 0001,
    "conta": 00001,
    "digito": 1,
    "dataAbertura": "01/03/2023 13:01:25",
    "status": "A",
    
}
```

<br/>
<hr>


`status code: 400`

#### Tipo do body: <b>Application/json</b>
```json
{
    "retorno": "{Mensagem de erro da regra de negocio}",    
}
```


<br/>
<hr>

# Tabela banco de dados


| campo | tipo | obrigatório | descrição 
|:-------:|:------:|:-------------:|---
| id    | int | sim | Id da conta com auto-incremento
| nome  | varchar(100) | sim | nome do cliente;
| agencia| int | sim | numero da agencia
| conta | int | sim | numero da conta
| digito | int | sim | número do digito da conta. que será gerada com o calculo do primeiro digito da agencia + mais o ultimo digito da agencia: agencia 2022: <b>2</b>02<b>2</b> = 2 + 2 = digito da conta será 4
| data | date | sim | data da abertura da conta
| status | char(1) | sim | Status da conta sendo "A" ativo, "E" encerrada, "B" bloqueada

</details>

</details>



