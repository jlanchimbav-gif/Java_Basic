import reflex as rx
import jaguar_app.components.styles.styles as styles

def link_icon() -> rx.Component:
    return rx.link(
        rx.icon(
            tag="link"
            ),
        href="#",
        is_external=True,
    )    