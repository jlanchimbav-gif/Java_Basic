import reflex as rx
import jaguar_app.components.styles.styles as styles

def title(text: str) -> rx.Component:
    return rx.heading(
        text,
        **styles.title_styles,
    )