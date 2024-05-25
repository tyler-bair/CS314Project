import React from 'react';
import { describe, expect, test, jest, beforeEach } from "@jest/globals";
import user from '@testing-library/user-event';
//import SaveAs from '../../../src/components/Header/SaveAs';
import { fireEvent, render, screen, waitFor } from '@testing-library/react';
import userEvent from '@testing-library/user-event';

describe('SaveAs', () => {
    /*
    const props = {
        toggleSaveAs: jest.fn(),
        setDisallowLoad: jest.fn()
    }

    const inputObject = "test"

    beforeEach(() => {
        render(<SaveAs
                isOpen={true}
                toggleSaveAs={props.toggleSaveAs}
                setDisallowLoad={props.setDisallowLoad}
                showMessage={props.showMessage}
                places={props.places}

            />
            );
    });
    
    test('base: renders when toggles', ()=>{
        screen.getByText("Save Trip As");
        })
    
    test('base: validates input', async () => {
        const fileNameInput = screen.getByTestId('file-name-input');
        user.type(fileNameInput, inputObject);

        await waitFor(() => {
            expect(fileNameInput.value).toEqual(inputObject);
        });
    })

    test('jbahny: saves JSON', async () =>{
        
    })
    */
    test('aninx: save SVG', async () =>{
        
    })

});
