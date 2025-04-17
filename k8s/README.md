# 🚀 1. Comandos para aplicar tudo
✅ 1. Subir o Deployment
```bash
kubectl apply -f deployment.yaml
```

✅ 2. Subir o LoadBalancer
``` 
kubectl apply -f service.yaml
```

# 🔍 2. Verificar o status
Verificar os pods:
```
kubectl get pods -l app=app-java
```
Verificar o Service com IP externo:
```
kubectl get svc app-java-service
```
⚠️ Aguarde alguns segundos/minutos para o EXTERNAL-IP aparecer se estiver na AWS com suporte a ELB.

# 🌐 Extras
Permtir a EC2 fazer o pull do seu ECR (no momento o K8S não assume IAM Role)
```
kubectl create secret docker-registry regcred --docker-server=<aws_account>.dkr.ecr.<region>.amazonaws.com --docker-username=AWS --docker-password=$(aws ecr get-login-password --region <region>)
```
