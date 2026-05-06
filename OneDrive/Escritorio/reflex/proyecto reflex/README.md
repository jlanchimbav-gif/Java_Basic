# Jaguar Web App

Una aplicación web moderna construida con **Reflex**, un framework Python para construir interfaces web interactivas rápidamente.

## 🚀 Características

- Interfaz moderna y responsive
- Componentes reutilizables
- Navbar personalizado
- Sección de encabezado con información
- Enlaces a redes sociales
- Estilos personalizados con colores y tipografía

## 📋 Requisitos

- Python 3.9 o superior
- Reflex 0.8.28 o superior

## 💻 Instalación

1. Clonar el repositorio:
```bash
git clone https://github.com/[usuario]/jaguar-web.git
cd proyecto\ reflex
```

2. Instalar las dependencias:
```bash
pip install -r requirements.txt
```

## 🏃 Ejecución

Para ejecutar la aplicación en modo desarrollo:

```bash
reflex run
```

La aplicación estará disponible en `http://localhost:3000/`

## 📁 Estructura del Proyecto

```
proyecto reflex/
├── jaguar_app/
│   ├── __init__.py
│   ├── constants.py
│   ├── jaguar_app.py
│   ├── components/
│   │   ├── info_text.py
│   │   ├── link_button.py
│   │   ├── link_icon.py
│   │   ├── navbar.py
│   │   └── styles/
│   │       ├── colors.py
│   │       ├── font.py
│   │       ├── styles.py
│   │       └── title.py
│   └── views/
│       └── header/
│           ├── header.py
│           └── links/
│               └── links.py
├── rxconfig.py
├── requirements.txt
└── README.md
```

## 🎨 Personalización

Los estilos y colores se encuentran en `jaguar_app/components/styles/`:
- **colors.py**: Definición de paleta de colores
- **font.py**: Configuración de tipografías
- **styles.py**: Estilos globales y componentes

## 👨‍💻 Autor

Estudiante de Ingeniería en TICS - Universidad Estatal de Milagro, Guayaquil, Ecuador

## 📝 Licencia

Este proyecto está bajo licencia MIT
