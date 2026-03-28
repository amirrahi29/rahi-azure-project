```
# command to connect container registry with AKS
az aks update --resource-group rahi-resource --name RahiCluster --attach-acr RahiRegistry

# delete any pods by tag name
kubectl set image deployment/rahiapp-deployment \
rahiapp=rahiregistry.azurecr.io/rahi-app-image:<Real tag from container registry>
```