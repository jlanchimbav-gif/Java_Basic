import reflex as rx
from jaguar_app.components.link_button  import link_button

def header() -> rx.Component:
    return rx.hstack(
        rx.text("Links"),
        link_button("twict"),
        link_button("youtube"),
        link_button("Discord"),
        link_button("GitHub"),
        width="100%",
        
    )