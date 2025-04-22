# Demo Hexagonal Architecture - Spring Boot

Este projeto segue os princípios da **arquitetura hexagonal (Ports and Adapters)**, separando claramente o domínio da aplicação das tecnologias externas (como bancos de dados e APIs).

![Application diagram](https://reflectoring.io/images/posts/spring-hexagonal/hexagonal-architecture_hu6764515d7030d45af6f7f498c79e292b_50897_956x0_resize_box_3.png)


## 🧱 Estrutura de Diretórios

```text
src/
└── main/
    ├── java/
    │   └── com/
    │       └── study/
    │           └── demo/
    │               ├── application/          
    │               │   ├── service/                  # Casos de uso (Application Services)
    │               │   │   └── CreateTaskService.java
    │               │   └── port/                     # Interfaces (Ports)
    │               │       ├── in/                   # Portas de entrada (Input Ports)
    │               │       │   └── CreateTaskUseCase.java
    │               │       └── out/                  # Portas de saída (Output Ports)
    │               │           └── TaskRepository.java
    │               ├── domain/                       
    │               │   ├── model/                    # Entidades do domínio
    │               │   │   └── Task.java
    │               │   └── service/                  # Regras de negócio puras
    │               │       └── TaskValidator.java
    │               └── adapters/                     # Implementações dos ports (Adapters)
    │                   ├── in/                       
    │                   │   └── rest/                 # Controladores REST (Input Adapter)
    │                   │       └── controller/
    │                   │           └── TaskController.java
    │                   └── out/                      
    │                       ├── persistence/          # Persistência com JPA (Output Adapter)
    │                       │   ├── entity/
    │                       │   │   └── TaskEntity.java
    │                       │   └── repository/
    │                       │       └── TaskJpaRepository.java
    │                       └── externalapi/          # Chamadas a APIs externas (Output Adapter)
    └── resources/
        ├── application.yml
        └── ...
        
```

