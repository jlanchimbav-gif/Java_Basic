"""Welcome to Reflex! This file outlines the steps to create a basic app."""

import reflex as rx
from jaguar_app.components.navbar import navbar
from jaguar_app.views.header.header import header
from rxconfig import config
import jaguar_app.components.styles.styles as styles
from jaguar_app.components.styles.title import title



class State(rx.State):
    """The app state."""


def index() -> rx.Component:
    return rx.box(
        navbar(),
        rx.center(
            rx.vstack(
                header(),
                max_width=styles.max_width,
                width="100%",
                margin=styles.spacer.BIG,
            )
        ),
    )
    


app = rx.App(
    stylesheets=styles.STYLESHEETS,
    style=styles.BASE_STYLES,
)
app.add_page(index)




