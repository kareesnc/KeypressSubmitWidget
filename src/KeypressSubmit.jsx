import { Component, createElement } from "react";

export class KeypressSubmit extends Component {
    constructor(props) {
        super(props);

        // interval config: 2 attempts per second, for 10s
        this.intervalHandle = undefined;
        this.intervalDelay = 500; // in ms
        this.maxAttempts = 20;
        this.currentAttempts = 0;
    }

    render() {
        let self = this;
        this.intervalHandle = setInterval(function() {
            self.addListeners();
        }, this.intervalDelay);
        return(<div></div>);
    }

    addListeners() {
        if(this.maxAttempts>=100) {
            clearInterval(this.intervalHandle);
            console.warn('Could not find required elements for keypress submit. ('+this.props.inputClass+','+this.props.submitClass+')');
            return;
        }
        this.currentAttempts++;

        let inputs = document.querySelectorAll('.'+this.props.inputClass+' input,'
                                              +'.'+this.props.inputClass+' select');
        let button = document.querySelector('.'+this.props.submitClass);

        if(inputs.length>0 && button) {
            clearInterval(this.intervalHandle);
            for (const input of inputs) {
                input.addEventListener('keyup', (event) => {
                    if(event.keyCode == this.props.keyCode) {
                        button.click();
                    }
                });
            }
        }
    }
}
