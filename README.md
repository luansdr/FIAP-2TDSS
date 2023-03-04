# upperBank

## Uma api para sistema bancário simples


- > <h2>Conta</h2>
    - [Cadastrar](#cadastrar-uma-conta)
    - [Listar todas](#listar-todas-contas)
    - [Mostrar detalhes](#mostrar-detalhes-de-uma-conta)
    - [Atualizar](#atualização-contas)
    - [Apagar](#apagar-conta)
  
<br/>

- > <h2>Login</h2>
    - [Cadastrar](#cadastrar-um-login)
    - [Listar todas](#listar-todos-login)
    - [Mostrar detalhes](#mostrar-detalhes-login)
    - [Atualizar](#atualização-login)
    - [Apagar](#apagar-login)
  
<br/>

-  > <h2> Investimento</h2>
    - [Cadastrar](#cadastrar-um-investimento)
    - [Listar todas](#listar-todos-investimento)
    - [Mostrar detalhes](#mostrar-detalhes-investimento)
    - [Atualizar](#atualização-investimento)
    - [Apagar](#apagar-investimento)

<br/>

- > <h2>Extrato</h2>
    - [Cadastrar](#cadastrar-um-extrato)
    - [Listar todas](#listar-todos-extrato)
    - [Mostrar detalhes](#mostrar-detalhes-extrato)
    - [Atualizar](#atualização-extrato)
    - [Apagar](#apagar-extrato)

<br/>

- > <h2>Transferencia</h2>
    - [Cadastrar](#cadastrar-uma-transfencia)
    - [Listar todas](#listar-todos-transfencia)
    - [Mostrar detalhes](#mostrar-detalhes-transfencia)
    - [Atualizar](#atualização-transfencia)
    - [Apagar](#apagar-transfencia)


<br/><br/>

<h1>Swagger upperbank</h1>

<details open>
<summary>Conta</summary>

<br>

<!-- <details>
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
    "digito": 0,
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
</details> -->

*****--------------------------------------------------------------------------******

<!-- <details open>
<summary> <b style="color:blue">GET</b> /upperbank/api/conta</summary>

<br/>

# Listar todas contas

<br/>

### Responses:
`status code: 200`

#### Tipo do body: <b>Application/json</b>
```json
[
    {
        "id": 1,
        "nome": "Luan Reis",
        "agencia": 0001,
        "conta": 00001,
        "digito": 0,
        "dataAbertura": "01/03/2023 13:01:25",
        "status": "A",
        
    },
     {
        "id": 2,
        "nome": "Joaizinho Pereira",
        "agencia": 0001,
        "conta": 00002,
        "digito": 0,
        "dataAbertura": "25/02/2023 22:21:25",
        "status": "A",
        
    },
     {
        "id": 3,
        "nome": "Maria Cesariana",
        "agencia": 2032,
        "conta": 12332,
        "digito": 2,
        "dataAbertura": "04/02/2023 01:10:56",
        "status": "A",
        
    }
]
```

<br/>
<hr>

`status code: 204`

#### Tipo do body: <b>Application/json</b>
```json
{
    "retorno": "Não há contas para retornar"
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
</details> -->


*****--------------------------------------------------------------------------******



<details open>
<summary> <b style="color:blue">GET</b> /upperbank/api/conta</summary>

<br/>

# Mostrar detalhes de uma conta

<br/>

### Responses:
`status code: 200`

#### Tipo do body: <b>Application/json</b>
```json
[
    {
        "id": 1,
        "nome": "Luan Reis",
        "agencia": 0001,
        "conta": 00001,
        "digito": 0,
        "dataAbertura": "01/03/2023 13:01:25",
        "status": "A",
        
    },
     {
        "id": 2,
        "nome": "Joaizinho Pereira",
        "agencia": 0001,
        "conta": 00002,
        "digito": 0,
        "dataAbertura": "25/02/2023 22:21:25",
        "status": "A",
        
    },
     {
        "id": 3,
        "nome": "Maria Cesariana",
        "agencia": 2032,
        "conta": 12332,
        "digito": 2,
        "dataAbertura": "04/02/2023 01:10:56",
        "status": "A",
        
    }
]
```

<br/>
<hr>

`status code: 204`

#### Tipo do body: <b>Application/json</b>
```json
{
    "retorno": "Não há contas para retornar"
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
</details>


<br/><br/>

# Tabela banco de dados


|  campo  |     tipo     | obrigatório | descrição                                                                              |
| :-----: | :----------: | :---------: | -------------------------------------------------------------------------------------- |
|   id    |     int      |     sim     | Id da conta com auto-incremento                                                        |
|  nome   | varchar(100) |     sim     | nome do cliente;                                                                       |
| agencia |     int      |     sim     | numero da agencia                                                                      |
|  conta  |     int      |     sim     | numero da conta                                                                        |
| digito  |     int      |     sim     | número do digito da conta. vai ser gerador de acordo com o primeiro numero da agencia. |
|  data   |     date     |     sim     | data da abertura da conta                                                              |
| status  |   char(1)    |     sim     | Status da conta sendo "A" ativo, "E" encerrada, "B" bloqueada                          |

</details>



