# Instrucciones Detalladas para Subir a GitHub

## ⚠️ IMPORTANTE: Requisitos Previos

1. **Tener una cuenta de GitHub** - Ve a https://github.com/signup (gratis)
2. **Git instalado en tu computadora** - Ya lo tienes configurado ✅
3. **Crear un repositorio VACÍO en GitHub** (sin README, sin .gitignore, sin licencia)

---

## PASO 1: Crear Repositorio en GitHub (CRUCIAL)

1. **Abre** https://github.com/new
2. **Repository name:** `jaguar-web` (puedes usar otro nombre si prefieres)
3. **Description:** "Aplicación web Jaguar construida con Reflex"
4. **Visibility:** Choose "Public" (para que sea visible a otros) o "Private"
5. **⚠️ IMPORTANTE:** Deja sin marcar:
   - ❌ "Initialize this repository with README"
   - ❌ "Add .gitignore"
   - ❌ "Choose a license"
6. **Click "Create repository"**

**GitHub te mostrará comandos. Copia la URL que aparece en pantalla.**

---

## PASO 2: Obtener tu Nombre de Usuario de GitHub

1. **Abre** https://github.com (inicia sesión si no lo estás)
2. **Click en tu avatar** en la esquina superior derecha
3. **Click en "Your profile"** o **"Settings"**
4. Tu nombre de usuario está en la URL: `github.com/[TU_USUARIO_AQUI]`
   - *Ejemplo:* https://github.com/alejandro123 → Tu usuario es `alejandro123`

---

## PASO 3: Conectar Local Git con GitHub

Reemplaza `TU_USUARIO` con tu usuario real de GitHub y ejecuta en PowerShell:

```powershell
cd "c:\Users\lanch\OneDrive\Escritorio\reflex\proyecto reflex"

# Configura el repositorio remoto (reemplaza TU_USUARIO)
git remote add origin https://github.com/TU_USUARIO/jaguar-web.git

# Verifica que se agregó correctamente
git remote -v
```

**Salida esperada:**
```
origin  https://github.com/TU_USUARIO/jaguar-web.git (fetch)
origin  https://github.com/TU_USUARIO/jaguar-web.git (push)
```

---

## PASO 4: Hacer Push (Subir el Código)

Ejecuta en PowerShell:

```powershell
git push -u origin main
```

### Si te pide credenciales:

**Opción A: Token de Acceso Personal (RECOMENDADO)**
1. Ve a https://github.com/settings/tokens
2. Click en "Generate new token" → "Generate new token (classic)"
3. Dale un nombre (ej: "jaguar-web-push")
4. Selecciona:
   - ✅ repo (acceso completo a repositorios)
   - ✅ workflow (si lo necesitas)
5. Click "Generate token"
6. **COPIA el token** (solo aparece una vez)
7. En el prompt de contraseña, pega el token

**Opción B: Autenticación de GitHub en VS Code**
- GitHub Copilot ya puede tener autenticación configurada
- Si se te pide autenticar, acepte el popup

---

## PASO 5: Verificar en GitHub

1. **Abre** https://github.com/TU_USUARIO/jaguar-web
2. Deberías ver:
   - ✅ Todos tus archivos
   - ✅ README.md visible
   - ✅ 2 commits en el historial

---

## ❌ Solución de Problemas

### Error: "fatal: 'origin' does not appear to be a 'git' repository"
```powershell
# Verifica que te encuentras en el directorio correcto
cd "c:\Users\lanch\OneDrive\Escritorio\reflex\proyecto reflex"
git status
```

### Error: "Authentication failed"
```powershell
# Verifica tu URL remota
git remote -v

# Si es incorrecta, cámbiala
git remote remove origin
git remote add origin https://github.com/TU_USUARIO/jaguar-web.git
```

### Error: "branch 'main' set up to track 'origin/main'"
✅ Esto es NORMAL. Significa que se subió correctamente.

### Error: "Repository not found"
- Verifica que escribiste tu usuario correctamente
- Asegúrate de que creaste el repositorio en GitHub
- Copia la URL exacta de GitHub

---

## 📝 Información del Proyecto Local

**Commits actuales:**
- c104048: Initial commit: Jaguar Web App project setup
- 3dca857: Add GitHub setup instructions

**Branch:** main

**Archivos rastreados:** 20 archivos

---

## 🔄 Comandos Útiles Después de Subir

```powershell
# Ver estado
git status

# Ver commits
git log

# Ver remotes
git remote -v

# Hacer cambios y subir nuevamente
git add .
git commit -m "Tu mensaje aquí"
git push
```
