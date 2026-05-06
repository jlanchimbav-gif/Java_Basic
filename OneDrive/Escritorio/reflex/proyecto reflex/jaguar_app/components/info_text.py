import reflex as rx
import jaguar_app.components.styles.styles as styles
from jaguar_app.components.styles.colors import Colors as colors
from jaguar_app.components.styles.colors import textcolors


def info_text(title: str, body: str) -> rx.Component:
    return rx.box(
        rx.text(title, font_weight="bold", color=colors.PRIMARY.value),
        rx.text(body),
        font_size="1em",
        color=textcolors.BODY.value,
    )