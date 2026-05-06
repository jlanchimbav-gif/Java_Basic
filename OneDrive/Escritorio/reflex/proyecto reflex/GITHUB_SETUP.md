# Instrucciones para subir a GitHub

## Pasos para crear un nuevo repositorio en GitHub y subir el proyecto:

### 1. Crear un nuevo repositorio en GitHub

1. Ve a https://github.com/new
2. Ingresa el nombre del repositorio: `jaguar-web` (o el nombre que prefieras)
3. Agrega descripción: "Aplicación web Jaguar construida con Reflex"
4. Selecciona "Public" o "Private" según tus preferencias
5. NO selecciones "Initialize this repository with README" (ya tenemos archivos locales)
6. Haz clic en "Create repository"

### 2. Agregar el repositorio remoto y hacer push

Una vez creado el repositorio en GitHub, ejecuta en la terminal:

```bash
cd "c:\Users\lanch\OneDrive\Escritorio\reflex\proyecto reflex"

# Reemplaza TU_USUARIO con tu usuario de GitHub
git remote add origin https://github.com/TU_USUARIO/jaguar-web.git

# Cambiar branch master a main (si es necesario)
git branch -M main

# Hacer push del contenido
git push -u origin main
```

### 3. Verificar en GitHub

- Ve a tu repositorio en GitHub
- Deberías ver todos los archivos del proyecto
- Verifica que el README.md se muestre correctamente

## Alternativa: Usando SSH (si tienes SSH configurado)

```bash
git remote add origin git@github.com:TU_USUARIO/jaguar-web.git
git branch -M main
git push -u origin main
```

## Información del commit actual

✅ **Commit Hash:** c104048
✅ **Mensaje:** Initial commit: Jaguar Web App project setup
✅ **Archivos:** 19 files changed, 424 insertions
✅ **Branch:** main

## Estado del repositorio

Para verificar el estado en cualquier momento:
```bash
git status              # Ver archivos sin seguimiento
git log                 # Ver historial de commits
git remote -v          # Ver repositorios remotos configurados
```
